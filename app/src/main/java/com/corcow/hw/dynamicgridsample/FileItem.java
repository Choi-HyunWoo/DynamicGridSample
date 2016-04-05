package com.corcow.hw.dynamicgridsample;

/**
 * Created by multimedia on 2016-04-05.
 */
public class FileItem {

    public static final int TYPE_DIRECTORY = 1;             // 폴더
    public static final int TYPE_FILE = 2;                  // 파일
    // ...

    int fileType;

    FileItem (int fileType) {
        this.fileType = fileType;
        if (fileType == TYPE_DIRECTORY) {
            // iconImageResource = R.drawable.icon_folder
        } else if (fileType == TYPE_FILE){
            // iconImageResource = R.drawable.icon_pptx
        }
        //...

    }

    int iconImageResource;
    String fileName;

}
