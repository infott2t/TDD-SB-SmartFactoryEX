package com.example.tddspringex01;

import com.example.domain.User;

public class TddClass {

    public static void main(String[] args) {

       //How make code, check this. Reference, https://blog.naver.com/tt2t2am1118/222967998751
        //Hope good developing~. Have a good day~. Thank you.
        //Writing ...
        //Example,
        /**
         * Product01 a = new Product01("Sweater01", "Cloths", false, null, "Image", "ProductDescription...", "10000", "2500");
         *
         * User01 u = new User01("abcId","abcPw","abcName","abcEmail","abcPhone","abcAddress","abcAddressDetail","abcAddressPostCode");
         *
         *
         * */
        System.out.println("hello~. TDD. Test Driven Development.");

        System.out.println("User SignUp...");
        System.out.println("Need, User SignUp Form..., privacy policy, terms of use, etc...");

        User u = new User(1L,"userRole","name","email","phone","address","addressDetail","addressPostCode");

        System.out.println("User Login...");

        //Service Class making... How make after,... Funny~. Make this~. Yours. Thank you.

    }
}
