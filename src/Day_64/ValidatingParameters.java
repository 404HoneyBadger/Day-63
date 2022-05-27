package Day_64;

public class ValidatingParameters {

    public class Calculator {

        public int factorial(int num) {
            if (num < 0) {
                throw new IllegalArgumentException("Number must be positive.");
            }
            int answer = 1;
            for (int i = 1; i <= num; i++) {
                answer *= i;
            }

            return answer;
        }

        public int binomialCoefficent(int setSize, int subsetSize) {
            if (subsetSize > setSize) {
                throw new IllegalArgumentException("subset must be smaller than the set!");
            }
            int numerator = factorial(setSize);
            int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

            return numerator / denominator;
        }
    }

    public class Person {
        
        private String name;
        private int age;

        public Person(String name, int age) {
            if (name == null || name.isEmpty() || name.length() > 40) {
                throw new IllegalArgumentException("Name must not be empty, null or greater than 40 characters!");
            } else if ( age < 0 || age > 120) {
                throw new IllegalArgumentException("age out of range");
            }
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
