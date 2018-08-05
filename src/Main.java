import java.util.Scanner;

/*******************************************************
 * Copyright (C) 2018 iQIYI.COM - All Rights Reserved
 *
 * This file is part of {cupid_2}.
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): wangwei02_sx <wangwei02_sx@qiyi.com>
 *
 *******************************************************/
public class Main {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            int each_num=str.length()/4;
            System.out.println(each_num);

            int [][]forward={{0,1},{1,0},{0,-1},{-1,0}};
            String [][]strs=new String[each_num+1][each_num+1];
            int forward_int=0;
            int count=0;
            int x=0,y=0;
            for(int i=0;i<each_num+1;i++){
                if (i==0){
                    System.out.println(str.substring(0,each_num+1));

                }else if (i==each_num){
                    System.out.println(str.substring(each_num*2,each_num*2+each_num+1));
                }else {
                    for ( int j=0;j<each_num;j++){
                        if (j==0){
                            System.out.print(str.charAt(each_num*4-i));
                        }
                        else if (j==each_num){
                            System.out.println(str.charAt(each_num));
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
            }

        }
    }
}
