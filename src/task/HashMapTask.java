	package task;
	
import java.util.Collection;
//import java.util.HashMap;  
import java.util.Map;
import java.util.Set;

import helper.Helper;
import invalidexception.InputInvalidException;

public class HashMapTask {
	
	@SuppressWarnings("unchecked")
	public <K,V> Map<K,V> getHashMap() throws ReflectiveOperationException
	{
		Class<?> myTask = Class.forName("java.util.HashMap");
		Object myObj = myTask.getDeclaredConstructor().newInstance();
		return (Map<K,V>) myObj;
	}
	public <K,V> int getSize(Map<K,V> myHashMap)throws InputInvalidException{
		Helper.checkNull(myHashMap);
		return myHashMap.size();
	}
	public <K,V> void setKeysNvalues(Map<K,V> myMap, K key, V value)throws InputInvalidException{
		Helper.checkNull(myMap);
		myMap.put(key, value);
	}
	public <K,V> boolean checkKeyExist(Map<K,V> myMap,K key)throws InputInvalidException {
		Helper.checkNull(myMap);
		return myMap.containsKey(key);
	}
	public <K,V> boolean checkValueExist(Map<K,V> myMap, V value)throws InputInvalidException {
		Helper.checkNull(myMap);
		return myMap.containsValue(value);
	}
	public <K,V> void changeValue(Map<K,V> myMap,K key,V value)throws InputInvalidException {
		Helper.checkNull(myMap);
		myMap.replace(key, value);
	}
	public <K,V> V getValue(Map<K,V> myMap,K key)throws InputInvalidException {
		Helper.checkNull(myMap);
		return myMap.get(key);
	}
    public <K,V> V getValueWithDefult(Map<K,V> myMap,K key,V dfault)throws InputInvalidException {
    	Helper.checkNull(myMap);
    	return myMap.getOrDefault(key, dfault);
    }
    public <K,V> void removeKey(Map<K,V> myMap,K key )throws InputInvalidException {
    	Helper.checkNull(myMap);
    	myMap.remove(key);

    }
    public <K,V> void changeIfMatch(Map<K,V> myMap,K key,V value,V newValue)throws InputInvalidException {
    	Helper.checkNull(myMap);	
    	myMap.replace(key, value, newValue);
    }
    public <K,V> void removeIfValueMatch(Map<K,V> myMap,K key,V value) throws InputInvalidException{
    	Helper.checkNull(myMap);
    	myMap.remove(key, value);
    }
    public <K,V> void copyFromMap(Map<K,V> myMap,Map<K,V> newMap) throws InputInvalidException{
    	Helper.checkNull(myMap);
    	myMap.putAll(newMap);
    }
   public <K,V> Set<K> getAllKeys(Map<K,V> myMap)throws InputInvalidException {
	   Helper.checkNull(myMap);
	   return myMap.keySet();
   }
   public <K,V> Collection<V> getAllValues(Map<K,V> myMap) throws InputInvalidException{
	   Helper.checkNull(myMap);
	   return myMap.values();
   }

    public <K,V> void removeAllKeys(Map<K,V> myMap) throws InputInvalidException{
    	Helper.checkNull(myMap);
    	myMap.clear();
    }
}
