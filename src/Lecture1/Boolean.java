package Lecture1;

public class Boolean {

    public static void main(String args[]){ //打psvm可以快速打出这一行
        boolean c = false;
        boolean a = false;
        boolean b = false;
        // create a boolean expression that is true unless both a and b are true;
        // and: &&
        // or: ||

        if (a == true && b == true){
            c = true;
        }
        c = !a;
//    if(something){ 注释的快捷键是command+/
//        do_something;
//    }
//    if(something){
//        do_something;
//    }else{
//
//    }
//
//    if(something){
//        do_something;
//    }else if(){
//        do_something;
//    }else{
//        do_something;
//    }

        int i = 100;
        while(i > 49){
            System.out.println(i);
            i--;
        }

        for(int j = 100; j > 49; j--){ //一个scope只能有一个同名的variable
            System.out.println(j);
        }
        for(int j = 1000; j > 499; j--){
            System.out.println(j);
        }

        int aa[][] = {{1,1,1}, {2,2,2}, {3,3,3}};

        int bb = aa[1].length;

        for(int j = 0; j < aa.length; j++){
            for(int k = 0; k < aa[j].length; k++){
                System.out.println(aa[j][k]);
            }
        }





    }



}
