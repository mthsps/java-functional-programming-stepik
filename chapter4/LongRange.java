package chapter4;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

// https://stepik.org/lesson/498023/step/8
class LongRange {
    private final long left;
    private final long right;

    public static Comparator<LongRange> getComparator() {
        // write your code here
        return Comparator
                .comparing((LongRange a) -> Math.abs(a.getRight()- a.getLeft()))
                .thenComparing(LongRange::getLeft);
    }


    public LongRange(long left, long right) {
        this.left = left;
        this.right = right;
    }

    public long getLeft() {
        return left;
    }

    public long getRight() {
        return right;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        LongRange longRange = (LongRange) other;
        return left == longRange.left &&
                right == longRange.right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return String.format("%d %d", left, right);
    }
}
