package hashmaptest;

import task.HashMapTask;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import invalidexception.InputInvalidException;

public class HashMapTester {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("myLogger");
		Scanner hashMapScan = new Scanner(System.in);
		Scanner intScanner = new Scanner(System.in);
		
		HashMapTask myTask = new HashMapTask();
		
		logger.log(Level.INFO, "1. program to create hashmap and print its size \n 2.create hashmap and add keys(strings) & "
				+ "values(string) \n 3.create hashmap and add keys(integer) & values(integer) \n 4.create hashmap and add "
				+ "keys(strings) & values(integer) \n 5.create hashmap and add keys(integer) & values(own object) \n "
				+ "6. create hashmap and add keys(string) and one of the value as null \n 7.create hashmap and add null key &"
				+ " non null values \n 8. check existance of key \n 9. check existance of values \n 10.create hashmap and add"
				+ " keys(strings) & values(string) and change values for keys  \n 11. get the values of existing keys \n 12. "
				+ "get values of non existing keys \n 13. create a hashmap and set default value for non existing keys \n 14. "
				+ "create a hashmap and remove a existing key \n 15. create a hash map and remove a key if value matches "
				+ "\n 16. replace the valiue in existing key \n 17. replace the value to key if key matches value \n 18. trasfer "
				+ "all key value pair from one hashmap to other \n 19. print each key value pair of hashmap \n 20. remove all the "
				+ "entry in hashmap");
		int select =0;
		int noOfPair =0;
		String stringKey = null;
		String stringValues = null;
        Integer intValues =0;
        Integer intKey=0;
	    try {
		  do {
			logger.log(Level.INFO, "choose any one ");
			select = intScanner.nextInt();
			 Map<String,String> myMap = myTask.getHashMap();
				
			int mapSize =0;
				if(select >= 8) {
					
					logger.log(Level.INFO, "enter the number of key value pair ");
				    noOfPair = intScanner.nextInt();
				    
					for(int i=0; i<noOfPair;i++) {
							
						logger.log(Level.INFO, "Enter the key(String): ");
						stringKey = hashMapScan.nextLine(); 
						
						logger.log(Level.INFO, "Enter the value(String): ");
						stringValues = hashMapScan.nextLine();
						
						myTask.setKeysNvalues(myMap,stringKey,stringValues);
					  }
				}
			
				switch(select) {
			
				case 1:
					
					mapSize = myTask.getSize(myMap);	
					logger.log(Level.INFO, "The size of the empty hashmap is "+mapSize);
				
				break;
				
				case 2:
					
					logger.log(Level.INFO, "enter the number of key value pair ");
				    noOfPair = intScanner.nextInt();
				    
					for(int i=0; i<noOfPair;i++) {
						logger.log(Level.INFO, "Enter the key(String): ");
						stringKey = hashMapScan.nextLine(); 
						
						logger.log(Level.INFO, "Enter the value(String): ");
						stringValues = hashMapScan.nextLine();
						
						myTask.setKeysNvalues(myMap,stringKey,stringValues);
					  }
					
					logger.log(Level.INFO, "The final hash map is "+myMap);
					mapSize = myTask.getSize(myMap);	
					logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				    break;
				    
			   case 3:
				   Map<Integer,Integer> myMapIi = myTask.getHashMap();
				   
					logger.log(Level.INFO, "enter the number of key value pair ");
				    noOfPair = intScanner.nextInt();
				    
					for(int i=0; i<noOfPair;i++) {
							
						logger.log(Level.INFO, "Enter the key(Integer): ");
						intKey = intScanner.nextInt();
						
						logger.log(Level.INFO, "Enter the value(Integer): ");
						intValues = intScanner.nextInt();
						
						myTask.setKeysNvalues(myMapIi,intKey,intValues );
					  }
					
					logger.log(Level.INFO, "The final hashmap is "+myMapIi);
					mapSize = myTask.getSize(myMapIi);	
					logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				    break;
				    
			   case 4:
				   
				   Map<String,Integer> myMapSi = myTask.getHashMap();

					logger.log(Level.INFO, "enter the number of key value pair ");
				    noOfPair = intScanner.nextInt();
				    
					for(int i=0; i<noOfPair;i++) {
							
						logger.log(Level.INFO, "Enter the key(String): ");
						stringKey = hashMapScan.nextLine(); 
						
						logger.log(Level.INFO, "Enter the value(integer): ");
						intValues = intScanner.nextInt();
						
						myTask.setKeysNvalues(myMapSi,stringKey,intValues );
					  }
					logger.log(Level.INFO, myMapSi.toString());
					mapSize = myTask.getSize(myMapSi);		
					logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				    break;
				    
			   case 5:
				   Map<String,Object> myMapSo = myTask.getHashMap();
				   CustomObject myCustom = new CustomObject();
				   TesterObject myTester = new TesterObject();
				   
					logger.log(Level.INFO, "Enter the first string ");
				   stringKey = hashMapScan.nextLine(); 
				   myTask.setKeysNvalues(myMapSo,stringKey,myCustom );
				   
				   logger.log(Level.INFO, "Enter the second string ");
				   stringKey = hashMapScan.nextLine();
				   myTask.setKeysNvalues(myMapSo,stringKey, myTester);
				   
				   logger.log(Level.INFO, myMapSo.toString());
				   mapSize = myTask.getSize(myMapSo);	
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
			   case 6:
				   myMapSo = myTask.getHashMap();
				   myCustom = new CustomObject();
				   
				   logger.log(Level.INFO, "Enter the first string ");
				   stringKey = hashMapScan.nextLine(); 
				   myTask.setKeysNvalues(myMapSo,stringKey,myCustom );
				   
				   logger.log(Level.INFO, "Enter the second string ");
				   stringKey = hashMapScan.nextLine();
				   myTask.setKeysNvalues(myMapSo,stringKey,null);	
				   
				   logger.log(Level.INFO, myMapSo.toString());
				   mapSize = myTask.getSize(myMapSo);		
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
			   case 7:
				   logger.log(Level.INFO, "Enter the value(String): ");
				   stringValues = hashMapScan.nextLine();
				   
                   myTask.setKeysNvalues(myMap,null,stringValues);	
				   
				   logger.log(Level.INFO, myMap.toString());
				   mapSize = myTask.getSize(myMap);	
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
			   case 8:
					logger.log(Level.INFO, "Enter the key to check existance");
					String keyToCheck = hashMapScan.nextLine();
					
					boolean isExist = myTask.checkKeyExist(myMap,keyToCheck);
				    logger.log(Level.INFO, "Is key exist in the hashmap "+isExist);
					break;
					
			   case 9:
					
				    logger.log(Level.INFO, "Enter the value to check existance");
				    String valueToCheck = hashMapScan.nextLine();
					
				    isExist = myTask.checkKeyExist(myMap,valueToCheck);
				    logger.log(Level.INFO, "Is value exist in the hashmap - "+isExist);
				    break;
				    
			   case 10:
				   for(int i=0; i<noOfPair;i++) {
					   logger.log(Level.INFO, "Enter the key to replace the value ");
					   String replaceKey = hashMapScan.nextLine();
					   
					   logger.log(Level.INFO, "Enter the value to replace ");
					   String replaceValue = hashMapScan.nextLine();
					   
					   myTask.changeValue(myMap, replaceKey, replaceValue);
					
				   }
				   logger.log(Level.INFO, "The hashmap after changing the values to keys"+myMap);
				   mapSize = myTask.getSize(myMap);	
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
			   case 11:
			   case 12:
				   logger.log(Level.INFO, "Enter the key to get value ");
				   
				   String keyToFind = hashMapScan.nextLine();
				   String valueGet = myTask.getValue(myMap,keyToFind);
				   logger.log(Level.INFO, "The value correspond to key "+keyToFind+" is "+valueGet);
				   break;
				   
			   case 13:
				   	logger.log(Level.INFO, "Enter the default value for non existing keys");
				   	String defaultValue = hashMapScan.nextLine();
				   	
				   	logger.log(Level.INFO, "Enter the key to get value ");
					   
					keyToFind = hashMapScan.nextLine();
					mapSize = myTask.getSize(myMap);	
					logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
					
				   	valueGet = myTask.getValueWithDefult(myMap, keyToFind,defaultValue);
				   	logger.log(Level.INFO, "The value correspond to key "+keyToFind+" is "+valueGet);
				   	
				   	break;
			   case 14:
				   logger.log(Level.INFO, "Enter the key to remove ");
				   String keyToRemove = hashMapScan.nextLine();
				   myTask.removeKey(myMap,keyToRemove);
				   mapSize = myTask.getSize(myMap);	
				   
				   logger.log(Level.INFO, "The hashmap after removing key is "+myMap);
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
			   case 15:
				   logger.log(Level.INFO, "Enter the key to remove ");
				   keyToRemove = hashMapScan.nextLine();
				   logger.log(Level.INFO, "Enter the corresponding value to key");
				   String valueToRemove = hashMapScan.nextLine();
				   
				   myTask.removeIfValueMatch(myMap, keyToRemove, valueToRemove);
                   mapSize = myTask.getSize(myMap);	
				   
				   logger.log(Level.INFO, "The hashmap after removing key is "+myMap);
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
			   case 16:
				   logger.log(Level.INFO, "Enter the key to change value ");
				   String replaceKey = hashMapScan.nextLine();
				   
				   logger.log(Level.INFO, "Enter the value to replace ");
				   String value = hashMapScan.nextLine();

				   myTask.changeValue(myMap,replaceKey, value);
				   logger.log(Level.INFO, "The hashmap after changing the value for the key is "+myMap);
				   mapSize = myTask.getSize(myMap);	
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
			   case 17:
				   logger.log(Level.INFO, "Enter the key to replace the value ");
				   replaceKey = hashMapScan.nextLine();
				   
				   logger.log(Level.INFO, "Enter the old value ");
				   String oldValue = hashMapScan.nextLine();
				   
				   logger.log(Level.INFO, "Enter the value to replace ");
				   String newValue = hashMapScan.nextLine();
				   
				   myTask.changeIfMatch(myMap, replaceKey, oldValue, newValue);
				   logger.log(Level.INFO, "The hashmap after changing the value for the key is "+myMap);
				   mapSize = myTask.getSize(myMap);	
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
			   case 18:
				   
				   Map<String,String> newMap = myTask.getHashMap();
				   logger.log(Level.INFO, "enter the number of key value pair ");
				    noOfPair = intScanner.nextInt();
				    
					for(int i=0; i<noOfPair;i++) {
							
						logger.log(Level.INFO, "Enter the key(String): ");
						stringKey = hashMapScan.nextLine(); 
						
						logger.log(Level.INFO, "Enter the value(String): ");
						stringValues = hashMapScan.nextLine();
						
						myTask.setKeysNvalues(newMap,stringKey,stringValues);
					  }
				   myTask.copyFromMap(myMap, newMap);
				   
				   logger.log(Level.INFO, "The hashmap after changing the value for the key is "+myMap);
				   mapSize = myTask.getSize(myMap);	
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
			   case 19:
				   Set<String> mySet = myTask.getAllKeys(myMap);
				   logger.log(Level.INFO, "The keys are "+mySet);
				   logger.log(Level.INFO, "The respective values for keys are "+myTask.getAllValues(myMap));
				  
				  
				   break;
			   case 20:
				   myTask.removeAllKeys(myMap);
				   logger.log(Level.INFO, "The hashmap after deleting all the keys is "+myMap);
				   mapSize = myTask.getSize(myMap);	
				   logger.log(Level.INFO, "The size of the hashmap is "+mapSize);
				   break;
				   
				}
			
		}while(select != 0);
	}catch(InputInvalidException ie) {
		logger.log(Level.SEVERE, ie.getCause().toString());
	}catch(ReflectiveOperationException e) {
		logger.log(Level.SEVERE, e.getMessage());
		
	}
	}
}
