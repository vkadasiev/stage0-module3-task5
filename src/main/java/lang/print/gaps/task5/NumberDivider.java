package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        int divided = toBeDivided / 5;
        System.out.println(toBeDivided + " divided by 5 is equal to " + divided );
    }
        public static void main(String[] args) {
            NumberDivider divide = new NumberDivider();
            divide.divide (20);
        }

    }

