package TCS;

import java.util.*;

public class ExamCheating {


        public static int maxStudentsInMeritList(int n, int[] marks, int[][] reevaluations) {
            Set<Integer> meritList = new HashSet<>();
            System.out.println("Initial marks: " + Arrays.toString(marks));

            for (int[] reeval : reevaluations) {
                int x = reeval[0];
                int y = reeval[1];
                System.out.println("Reevaluating student at index " + x + " with new marks " + y);

                if (x < 0 || x >= n) {
                    System.out.println("Invalid index: " + x);
                    continue; // Ensure valid index
                }
                marks[x] = y;
                System.out.println("Updated marks: " + Arrays.toString(marks));

                List<Integer> indices = new ArrayList<>();
                for (int i = 0; i < n; i++) indices.add(i);
                indices.sort((a, b) -> marks[b] - marks[a]);
                System.out.println("Sorted indices based on marks: " + indices);

                for (int i = 0; i < Math.min(3, n); i++) {
                    meritList.add(indices.get(i));
                    System.out.println("Added student at index " + indices.get(i) + " to merit list");
                }
            }

            System.out.println("Final merit list: " + meritList);
            return meritList.size();
        }

        public static void main(String[] args) {
            int n = 5;
            int[] marks = {50, 60, 70, 80, 90};
            int[][] reevaluations = { {0, 95}, {2, 85}, {4, 75}, {1, 100} };

            System.out.println("Maximum number of students in merit list: " + maxStudentsInMeritList(n, marks, reevaluations));
        }


}
