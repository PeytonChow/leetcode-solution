package cn.neaghfoz;

public class RectangleOverlap {

    public static void main(String[] args) {
        RectangleOverlap solution = new RectangleOverlap();

        int[] rec1 = new int[]{0, 0, 2, 2};
        int[] rec2 = new int[]{1, 1, 3, 3};

//        int[] rec1 = new int[]{0, 0, 1, 1};
//        int[] rec2 = new int[]{1, 0, 2, 1};

        System.out.println(solution.isRectangleOverlap(rec1, rec2));
    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec1[2] > rec2[0] && rec1[1] < rec2[3] && rec1[3] > rec2[1];
    }

}
