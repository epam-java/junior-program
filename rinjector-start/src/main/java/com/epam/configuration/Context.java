package com.epam.configuration;

import java.util.HashMap;
import java.util.Map;

/**создает готовые объекты классов считывая конфигурацию из переданного xml**/
public class Context {
    private Map<String, Object> objectsById = new HashMap<>();
    private Map<String, Object> objectsByClassName = new HashMap<>();
    public Context(String xmlPath) {
        parseXml(xmlPath);
        initializeStorage();
    }
    //TODO распарсить конфигурацию из xml
    private void parseXml(String xmlPath) {

    }
    //TODO сконфигурировать объект на основе полученных данных из xml
    private void initializeStorage() {

    }
    //TODO получить готовый объект по id
    public Object getStorageById(String storageId) {
        return objectsById.get(storageId);
    }

    //TODO получить готовый объект по имени класса
    public Object getStorageByClassName(String className){
        return objectsByClassName.get(className);
    }
}
