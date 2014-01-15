package android.support.v4.util;

/**
 * Created by huibin on 1/11/14.
 */
public class SimpleArrayMap<K, V> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArrayMap";
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    static java.lang.Object[] mBaseCache;
    static int mBaseCacheSize;
    static java.lang.Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    int[] mHashes;
    java.lang.Object[] mArray;
    int mSize;

    int indexOf(java.lang.Object key, int hash) { /* compiled code */ }

    int indexOfNull() { /* compiled code */ }

    private void allocArrays(int size) { /* compiled code */ }

    private static void freeArrays(int[] hashes, java.lang.Object[] array, int size) { /* compiled code */ }

    public SimpleArrayMap() { /* compiled code */ }

    public SimpleArrayMap(int capacity) { /* compiled code */ }

    public SimpleArrayMap(android.support.v4.util.SimpleArrayMap map) { /* compiled code */ }

    public void clear() { /* compiled code */ }

    public void ensureCapacity(int minimumCapacity) { /* compiled code */ }

    public boolean containsKey(java.lang.Object key) { /* compiled code */ }

    int indexOfValue(java.lang.Object value) { /* compiled code */ }

    public boolean containsValue(java.lang.Object value) { /* compiled code */ }

    public V get(java.lang.Object key) { /* compiled code */ }

    public K keyAt(int index) { /* compiled code */ }

    public V valueAt(int index) { /* compiled code */ }

    public V setValueAt(int index, V value) { /* compiled code */ }

    public boolean isEmpty() { /* compiled code */ }

    public V put(K key, V value) { /* compiled code */ }

    public void putAll(android.support.v4.util.SimpleArrayMap<? extends K, ? extends V> array) { /* compiled code */ }

    public V remove(java.lang.Object key) { /* compiled code */ }

    public V removeAt(int index) { /* compiled code */ }

    public int size() { /* compiled code */ }

    public boolean equals(java.lang.Object object) { /* compiled code */ }

    public int hashCode() { /* compiled code */ }

    public java.lang.String toString() { /* compiled code */ }
}
