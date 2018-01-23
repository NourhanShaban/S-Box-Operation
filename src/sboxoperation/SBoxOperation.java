
package sboxoperation;

import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;




 

 

public class SBoxOperation {
 


 

   
    public static void main(String[] args) {
        Scanner  sc1=new Scanner(System.in);
      int table=0;
       String plain=sc1.next();
       String x="";
       String formatedinput="";
  int [][] s1 = { { 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7 }, { 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8 }, { 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0 }, { 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 } };
	int [][]s2 = { { 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10, }, { 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5 }, { 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15 }, { 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9, } };
	int [][]s3 = { { 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8 }, { 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1 }, { 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7 }, { 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12 } };
	int [][]s4 = { { 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15 }, { 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9 }, { 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4 }, { 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14 } };
	int[][] s5 = { { 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9 }, { 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6 }, { 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14 }, { 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3, } };
	int[][] s6 = { { 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11 }, { 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8 }, { 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6 }, { 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13 } };
	int [][]s7 = { { 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1 }, { 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6 }, { 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2 }, { 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12 } };
	int [][]s8= { { 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7 }, { 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2 }, { 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8 }, { 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11 } };

        for(int p=0;p<plain.length();p++)
   {
      switch (plain.charAt(p))
      {
          case '0':
              x="0000";
              break;
              case'1':
                  x="0001";
                  break;
              case '2':
                  x="0010";
                  break;
              case '3':
                  x="0011";
                  break;
              case '4':
                  x="0100";
                  break;
              case '5':
                  x="0101";
                  break;
              case '6':
                  x="0110";
                  break;
              case '7':
                  x="0111";
                  break;
              case '8':
                  x="1000";
                  break;
              case '9':
                  x="1001";
                  break;
              case 'A':
                  x="1010";
                  break;
              case 'B':
                  x="1011";
                  break;
              case 'C':
                  x="1100";
                  break;
              case 'D':
                  x="1101";
                  break;
              case 'E':
                  x="1110";
                  break;
              case 'F':
                  x="1111";
                  break;
                  
              
      }
      formatedinput=formatedinput+x;
   }
        String output="";
        
        for (int i = 0; i < formatedinput.length(); i=i+6)
        {
            String c=formatedinput.substring(i,i+6);
            table++;
            if(table==1)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s1[row][column];
               
               output=output+Integer.toHexString(value);
                
            }
            else if(table==2)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s2[row][column];
               output=output+Integer.toHexString(value);
                
            }
            else if(table==3)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s3[row][column];
               output=output+Integer.toHexString(value);
                
            }
            else if(table==4)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s4[row][column];
                output=output+Integer.toHexString(value);
                
            }
            else if(table==5)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s5[row][column];
                output=output+Integer.toHexString(value);
                
            }
            else if(table==6)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s6[row][column];
               output=output+Integer.toHexString(value);
                
            }
            else if(table==7)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s7[row][column];
               output=output+Integer.toHexString(value);
                
            }
            else if(table==8)
            {
               StringBuilder d=new StringBuilder();
               d.append(c.charAt(0));
               d.append(c.charAt(c.length()-1));
               String f=d.toString();
               int row = Integer.parseInt(f, 2);
                 int column=Integer.parseInt(c.substring(1,5),2);
                 int value=s8[row][column];
                output=output+Integer.toHexString(value);
                
            }
            
            
        }
        System.out.println(output.toUpperCase());
        
        
        
    }  
}