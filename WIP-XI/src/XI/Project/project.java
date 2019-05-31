/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class project {

    public static void main(String[] args) {
        int item = 0;
        int limit = 10, menu;
        System.out.println("1.Add\n 2.remove\n 3.Check");
        System.out.println("โกดังสินค้า");
        System.out.println("เลือกเมนู");

        Scanner input = new Scanner(System.in);
        menu = input.nextInt();
        if (menu == 1) {
            if (item <= limit) {
                int amout;
                amout=input.nextInt();
               if(item+amout >limit ){
                   System.out.println("ไอเท็มเกินลิมิต");
               }else{
                  item= item+amout;
                   System.out.println(item+","+limit);
               }
            } else {
                System.out.println("ไอเท็มเต็มเเล้ว");

            }

        }
        else if (menu==2){
            if (item>0){
                int amout;
                amout = input.nextInt();
                if(item-amout>=0){
                    item=item-amout;
                    System.out.println(item+","+limit);
                }
                else{
                    System.out.println("ไอเท็มไม่เพียงพอ");
                }
            }else
                System.out.println("ไอเท็มไม่เพียงพอ");
        }else if (menu==3){
            System.out.println(item+","+limit);
        }
        else{
            System.out.println("เมนูไม่ถูกต้อง");
        }
         
    }

}
