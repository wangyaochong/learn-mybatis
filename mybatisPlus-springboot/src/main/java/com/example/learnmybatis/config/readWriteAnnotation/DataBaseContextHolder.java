package com.example.learnmybatis.config.readWriteAnnotation;

public class DataBaseContextHolder {

    public enum DataBaseType {
        MASTER, SLAVE
    }

    private static final ThreadLocal<DataBaseType> contextHolder = new ThreadLocal<>();


    public static void setDataBaseType(DataBaseType dataBaseType) {
        if (dataBaseType == null) throw new NullPointerException();
        contextHolder.set(dataBaseType);
    }

    public static DataBaseType getDataBaseType() {
        return contextHolder.get() == null ? DataBaseType.MASTER : contextHolder.get();
    }

    public static void clearDataBaseType() {
        contextHolder.remove();
    }


}
