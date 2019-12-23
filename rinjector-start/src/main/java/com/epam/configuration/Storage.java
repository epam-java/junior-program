package com.epam.configuration;

import java.util.Map;

/**класс представляет собой хранилище для переноса информации из конфигурации в объекты**/
public class Storage {
    private String id;
    private String className;
    private Map<String, Property> properties;

    public Storage(String id, String className, Map<String, Property> properties) {
        this.id = id;
        this.className = className;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map<String, Property> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                ", properties=" + properties +
                '}';
    }
}
