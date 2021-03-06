package logic;

public class CabinType {
   private final int capacity;
   private final int count;
   private final boolean hasWindow;

   public CabinType(int capacity, boolean hasWindow, int count) {
      this.count = count;
      this.capacity = capacity;
      this.hasWindow = hasWindow;
   }

   public int getCount() {
      return count;
   }

   public boolean hasWindow() {
      return hasWindow;
   }

   public int getCapacity() {
      return capacity;
   }
}

