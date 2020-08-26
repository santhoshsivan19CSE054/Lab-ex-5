/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author user
 */
public class banks {
    public static void main(String[]args){
        bank b;
        b=new bankA();
        System.out.println(b.getbalance());
        b=new bankB();
        System.out.println(b.getbalance());
        b=new bankC();
        System.out.println(b.getbalance());
    
}
}
class bank
{
    int getbalance()
    {
        return 0;
    }
}
class bankA extends bank
{
    int getbalance()
    {
        return 1000;
    }
}
class bankB extends bank
{
    int getbalance()
    {
        return 1500;
    }
}
class bankC extends bank
{
    int getbalance()
    {
        return 2000;
    }
}