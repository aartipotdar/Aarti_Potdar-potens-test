class FindNumbers {
  
	boolean find3Numbers(int array[], int arr_size, int TotalSum)
	{
		int l, r;
		for (int i = 0; i < arr_size - 2; i++) {
			for (int j = i + 1; j < arr_size - 1; j++) {
				for (int k = j + 1; k < arr_size; k++) {
					if (array[i] + array[j] + array[k] == TotalSum) {
						System.out.print("Numbers are " + array[i] + ", " + array[j] + ", " + array[k]);
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		FindNumbers numbers = new FindNumbers();
		int array[] = { 1, 2, 6, 9, 3 };
		int TotalSum = 13;
		int arr_size = array.length;

		numbers.find3Numbers(array, arr_size, TotalSum);
	}
}