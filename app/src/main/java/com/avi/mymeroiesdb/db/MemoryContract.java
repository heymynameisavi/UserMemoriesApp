package com.avi.mymeroiesdb.db;

import android.provider.BaseColumns;

public class MemoryContract {

    //An empty private constructor makes sure that the class is not going to be initialised.
    private MemoryContract() {}

    public static final class MemoryEntry implements BaseColumns {
        public static final String TABLE_NAME = "memories";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_ADDRESS = "address";
        public static final String COLUMN_IMAGE = "image";
    }
}