public class MyInteger {
    private static int value;

    public MyInteger() {

    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        if (this.value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (this.value % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPrime() {
        int flag = 0;
        for (int i = 2; i <= this.value / 2; i++) {
            if (this.value % i == 0) {
                flag = 1;
                break;

            }

        }
            if(flag == 0){
                return true;
            }else{
                return false;
            }

    }
    public static boolean isEven(int value) {
        if (MyInteger.value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isOdd(int value) {
        if (MyInteger.value % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean isPrime(int value) {
        int flag = 0;
        for (int i = 2; i <= MyInteger.value / 2; i++) {
            if (MyInteger.value % i == 0) {
                flag = 1;
                break;

            }

        }
        if(flag == 0){
            return true;
        }else{
            return false;
        }

    }
    public static boolean isOdd(MyInteger value) {
        if (value.getValue() % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean isPrime(MyInteger value) {
        int flag = 0;
        for (int i = 2; i <= value.getValue() / 2; i++) {
            if (value.getValue() % i == 0) {
                flag = 1;
                break;

            }

        }
        if(flag == 0){
            return true;
        }else{
            return false;
        }

    }
    public static boolean isEven(MyInteger value) {
        if (value.getValue() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean equals(int value){
        return (this.getValue() == value);
    }
    public boolean equals(MyInteger value){
        if(this.getValue() == value.getValue())
            return true;
        return false;
    }

}
