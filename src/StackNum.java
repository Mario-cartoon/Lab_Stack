import java.awt.print.Printable;
import java.util.*;

public class StackNum {
    private static Scanner Sc;
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        MCommands mCommands;
        Scanner Sc;
        String StrCom;
        Number num =new Number();
        Stack <Integer> stack = new Stack<Integer>();

        while(true){
            System.out.print(">>");
            Sc = new Scanner(System.in);
            StrCom=Sc.nextLine();
            try {
                mCommands = MCommands.valueOf(StrCom);
            }catch (Exception ex){
                System.out.println("Command is not found");
                continue;
            }
            switch (mCommands){
                case input -> {
                    input(stack, num.getNum());
                }
                case output -> {
                    output(stack);
                }
                case remove -> {
                    remove(stack);
                }
                case size -> {
                    size(num);
                }
                case exit -> {System.exit(0);System.exit(0);}
            }
        }

    }
    public static void size(Number num){
        System.out.println("Input stacks's size >> ");
        int  sizeStack = 0;
        try {
            Sc = new Scanner(System.in);
            sizeStack = Sc.nextInt();
        }catch (Exception ex){
            System.out.println("Command is not found");
        }
        num.setNum(sizeStack);
        num.setNum(sizeStack);
    }


    public static void input(Stack stack, int num){
        Scanner sc =new Scanner(System.in);
        int n =0;
        try {
            for(int i =0;i< num;i++){
                n = sc.nextInt();
                stack.push(n);
            }
        }catch (Exception ex){
            System.out.println("Command is not found");
        }

    }


    public static void output(Stack stack){
        System.out.println(stack);
    }


    public static void remove(Stack stack){
        System.out.println("item to remove >>");
        int item=0;
        try {
            item = Sc.nextInt();

            for (int i = 0; i < item; i++) {
                stack.pop();
            }
        }catch (Exception ex){
            System.out.println("Command is not found");
        }
    }
}

enum MCommands{
    remove,
    input,
    output,
    size,
    exit
}

class Number {
    public int num;

    public int getNum() {
        return num;
    }

    public int setNum(int num) {
        this.num = num;
        return num;
    }

}

