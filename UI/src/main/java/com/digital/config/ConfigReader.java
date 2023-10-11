package com.digital.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private  static Properties properties;

    static {
        try{
            String path = "/Users/nurjigit.0808gmail.com/Desktop/DRT/SummerSDET2023/UI/src/main/resources/config.properties";
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static  String getProperty(String key){
        return properties.getProperty(key).trim();

    }

    public static void main(String[] args) {
        System.out.println(getProperty("browser"));
    }

//    public class ConfigReader {
//        /**
//         * Загружает конфигурационные данные из файла config.properties.
//         */
//        private static Properties properties;
//        static {
//            try {
//                String path ="C:\\Users\\Asus\\IdeaProjects\\Project-UI\\UI\\src\\main\\resources\\config.properties";
//                FileInputStream inputStream = new FileInputStream(path);
//                // для чтения содержимого файла по указанному пути
//                properties = new Properties();
//                // объект этого класса
//                properties.load(inputStream);
//                // загружает в этот класс все данные
//                inputStream.close();
//                // закрыли поток
//            }catch(IOException e){
//                e.printStackTrace();
//                // распечатали ошибку в случае чего
//            }
//        }
//
//    } с комментами на всякий случай
}
