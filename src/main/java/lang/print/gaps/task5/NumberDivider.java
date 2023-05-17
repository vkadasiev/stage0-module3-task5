package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        int divided = toBeDivided / 5;
        System.out.println(divided);
    }
        public static void main(String[] args) {
            NumberDivider divide = new NumberDivider();
            divide.divide (40);
        }

    }

