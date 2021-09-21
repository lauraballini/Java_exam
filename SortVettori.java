class SortVettori
{

public static void InsSort (int[] X)
{
	int i,j, min, indmin,z;
				for (i=0; i<X.length; i++)
				 { min=X[i]; indmin=i;
	     for(j=i+1; j<X.length; j++)
	{ if (X[j] < min) {indmin=j; min=X[j];};};
z= X[i]; X[i]=X[indmin]; X[indmin]=z;
};
for (i=0; i<X.length; i++)
		{ System.out.println(X[i]);}

}

public static void BubbleSort (int[] X)
{
	int i=0,j,z;
	boolean swap=true;
	while (i<X.length && swap)
	  { swap=false;
			for (j=0; j<X.length-1; j++)
			   { if (X[j] > X[j+1])
					 { z=X[j]; X[j]=X[j+1]; X[j+1]=z;
						 swap=true;
					 };
				 };
		};

  for (i=0; i<X.length; i++)
		{ System.out.println(X[i]);}

 }

public static void quick (int [] v)
{
	int i;
	quickSort(v, 0, v.length-1);
	for (i=0; i<v.length; i++)
		{ System.out.println(v[i]);}
}

 public static void quickSort(int arr[], int begin, int end) {
 	    if (begin < end) {
 	        int partitionIndex = partition(arr, begin, end);

 	        quickSort(arr, begin, partitionIndex-1);
 	        quickSort(arr, partitionIndex+1, end);
 	    }
 	}

	private static int partition(int arr[], int begin, int end) {
		    int pivot = arr[end];
		    int i = (begin-1);

		    for (int j = begin; j < end; j++) {
		        if (arr[j] <= pivot) {
		            i++;

		            int swapTemp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = swapTemp;
		        }
		    }

		    int swapTemp = arr[i+1];
		    arr[i+1] = arr[end];
		    arr[end] = swapTemp;

		    return i+1;
		}


	public static void merges (int [] v)
	{
		int i;
		int [] v1;
		v1=mergeSort(v, 0, v.length-1);
		for (i=0; i<v1.length; i++)
		{ System.out.println(v1[i]);}
	}

	public static int[] mergeSort(int arr[], int begin, int end) {
		if (begin == end) { int [] v3= new int[1];
			                  v3[0] = arr[begin];
												return v3;};
		int i = (int)Math.floor((begin+end)/2);
		int[] v1=mergeSort(arr,begin,i);
		int[] v2=mergeSort(arr,i+1,end);
		return merge(v1,v2);
		}


public static int[] merge( int [] X1, int [] X2)
		{  int i=0; int j=0; int k=0;  int [] Y = new int[X1.length+X2.length];
		while (j <X1.length & k< X2.length)
		{ if  (X1[j] <= X2[k])  {Y[i] = X1[j]; j++;}
		else {Y[i] = X2[k]; k++;};
		i++;
		};
		if (j==X1.length)
		{ while (k<X2.length) {Y[i]=X2[k];i++;k++;}};
		if (k==X2.length)
		{ while (j<X1.length) {Y[i]=X1[j];i++;j++;}};
		return(Y);
		}
	}
