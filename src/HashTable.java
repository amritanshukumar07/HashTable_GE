import java.util.LinkedList;

public class HashTable<K,V> {
 private final int bucketSize=10;
 private LinkedList<MyMapNode<K,V>>[] buckets;

 public HashTable(){
     buckets= new LinkedList[bucketSize];
     for(int i=0;i<bucketSize;i++){
         buckets[i]=new LinkedList<>();
     }
 }

 //Hash Function

    private int getBucketIndex(K key){
     int hashCode= key.hashCode();
     return Math.abs(hashCode%bucketSize);
    }

    // Add method

    public void put(K key, V value){
     int index= getBucketIndex(key);
     LinkedList<MyMapNode<K,V>> bucket= buckets[index];
     for(MyMapNode<K,V>node: bucket){
         if(node.key.equals(key)){
             node.value=value;
             return;
         }
     }
     MyMapNode<K,V> newNode = new MyMapNode<>(key,value);
     bucket.add(newNode);
    }
// get value associated with a key
    public V get(K key){
     int index= getBucketIndex(key);
     LinkedList<MyMapNode<K,V>> bucket = buckets[index];

     for(MyMapNode<K,V> node : bucket){
         if(node.key.equals(key)){
             return node.value;
         }
     }
     return null;
    }

    // display all key-value pairs
    public void display(){
     for(int i=0;i< bucketSize;i++){
         LinkedList<MyMapNode<K,V>> bucket= buckets[i];
         for(MyMapNode<K,V> node : bucket){
             System.out.println(node.key+ ": "+ node.value);
         }
     }
    }

}
