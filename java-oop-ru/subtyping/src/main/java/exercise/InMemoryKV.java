package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> storage;

    public InMemoryKV(Map<String, String> initialData) {
        this.storage = new HashMap<>(initialData); // Создаем новое хранилище на основе переданного словаря
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value); // Устанавливаем значение по указанному ключу
    }

    @Override
    public void unset(String key) {
        storage.remove(key); // Удаляем значение по указанному ключу
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue); // Возвращаем значение по ключу или значение по умолчанию
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage); // Возвращаем копию хранилища
    }
}
// END
