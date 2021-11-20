package org.rest;


public class App
{
    public static void main( String[] args )
    {
        String resultHeader = "";
        String cookie = Communication.getAllUsers();
        resultHeader += Communication.saveUser(cookie);
        resultHeader += Communication.updateUser(cookie);
        resultHeader += Communication.deleteUser(cookie);
        System.out.println(resultHeader);
    }
}
