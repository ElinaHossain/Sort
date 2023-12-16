class Sort {
	
	public static void swap(int[] arr, int j) {
		int tmp = arr[j+1];
		arr[j+1] = arr[j];
		arr[j] = tmp;
	}
	
	public static void swap(int[] arr, int minIndex, int i) {
		int tmp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = tmp;
	}

	// O(n^2)
	// Bubble Sort
	public static void bubbleSort(int[] arr) {		
		for(int i = 0; i < arr.length - 1; i++) {			
			for(int j = 0; j < arr.length-i-1; j++) {				
				if(arr[j] > arr[j+1]) {					
					swap(arr, j);					
				}
			}
		}		
	}
	
	// O(n^2)
	// Insertion Sort
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;			
		}	
	}
	
	// O(n^2)
	// Selection Sort
	public static void selectionSort(int[] arr) {	
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}						
			}			
			swap(arr, minIndex, i);		
		}	
	}
	
	// add heapSort to sort integers (bring anything you need from the Heap class for the heapSport to compile)
   public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            fixDown(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            fixDown(arr, i, 0);
        }
    }
    
    private static void fixDown(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            fixDown(arr, n, largest);
        }
    }
  
}
   
