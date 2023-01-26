package org.functional;

import java.util.function.Supplier;

public class SupplierFeature {

    public static void main(String[] args) {
//        System.out.println(getDBDatabaseConnect());
        System.out.println(getSupplierDB.get());
    }
    static String getDBDatabaseConnect() {
        return "jdbc://localhost:5432/users";
    }
    static Supplier<String> getSupplierDB = () -> "jdbc://localhost:5432/usersaaa";
}
