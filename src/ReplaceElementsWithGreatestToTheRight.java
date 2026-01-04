public class ReplaceElementsWithGreatestToTheRight {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 0) return arr;
        int maxRight = arr[arr.length -1];
        arr[arr.length - 1] = -1;

        for (int i = arr.length -2 ; i >= 0; i--){
            int currentValue = arr[i];
            arr[i] = maxRight;
            if (currentValue > maxRight){
                maxRight = currentValue;
            }

        }
        return arr;
    }
}
