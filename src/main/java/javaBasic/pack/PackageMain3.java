package javaBasic.pack;

import javaBasic.pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        javaBasic.pack.b.User userB = new javaBasic.pack.b.User();
    }
}
