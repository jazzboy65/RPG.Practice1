package collections;



/**
 * Коллекции - это сложные структуры данных, которые позволяют работать с большими объемами информации.
 * Все коллекции наследуются от интерфейса Collection.
 * Виды коллекций:
 * 1)Списки (List<T>) - Упорядоченный набор элементов.
 * Есть 2 реализации:
 * a)ArrayList<T> - это индексированный набор элементов (набор вагонов по номерам).
 * б)LinkedList<T> - это связанный список (каждый элемент ссылается на следующий и предыдущий),
 * (набор вагонов, смотрим на сцепки других вагонов).
 * 2)Множества (Set<T>) - Неупорядоченный набор уникальных элементов.
 * Есть 3 реализации:
 * а)HashSet<T> - это обьекты уникальные по хэшу (хэш-код).
 * б)LinkedHashSet<T> - сохраняет порядок вставки элементов.
 * в)TreeSet<T> - множество, в котором можно определить сортировку.
 * 3)Map (Map<K,V>) - набор пар, ключ - значение (key - value).
 * Ключи должны быть уникальными.
 * Есть 4 реализации:
 * а)HashMap<K,V> - Ключи должны быть уникальными по хэшу.
 * б)SortedMap<K,V> - Реализует сортировку по ключам.
 * в)LinkedHashMap<K,V> - Ключи должны быть уникальными по хэшу, сохраняя порядок вставки.
 * г)TreeMap<K,V> - Это представление Red Black Tree.
 *
 */

public class ViewsOfCollections {
}
