package code.problem.questions;

import java.util.*;

/**
 * Given a long list of events, each event with corresponding start and end time. Find the time period when there are most number of events overlapping each other.
 * for example list (start_time, end_time)
 * (5,8)
 * (1,5)
 * (4,5)
 * (2,6)
 * in time period 4 to 5, there are most number (3) events overlapping each other
 *
 * Shopee Test
 */
public class TimePeriodWithMostNumberOfEventsOverlapping {

    public static void main(String[] args) {
        List<Period> periods = null;
        List<Period> result = null;

        periods = new ArrayList<Period>();

        periods.add(new Period(5, 8));
        periods.add(new Period(1, 5));
        periods.add(new Period(4, 5));
        periods.add(new Period(2, 6));

        result = isOverlapping(periods);
        System.out.println("Periods tested: ");
        for (Period period : result) {
            System.out.println(period);
        }
    }

    // Method
    public static List<Period> isOverlapping(List<Period> periods) {
        // keeps unique periods only (Set ignore duplicate elements)
        Set<Period> periodSet = new HashSet<Period>();

        // overlap count
        int count = 0;

        // sort the periods by starting time.
        Collections.sort(periods, Comparator.comparingInt(x -> x.start));

        Period periodWithLatestEnd = null;

        for (Period period : periods) {
            // check overlapping
            if (periodWithLatestEnd != null && period.start < periodWithLatestEnd.end && periodWithLatestEnd.start < period.end ) {
                periodSet.add(period);
                periodSet.add(periodWithLatestEnd);
                count++;
                System.out.println(period + " overlaps with " + periodWithLatestEnd);
            }

            // update the period with latest end
            if (periodWithLatestEnd == null || periodWithLatestEnd.end < period.end) {
                periodWithLatestEnd = period;
            }
        }
        System.out.println("Overlapping count: " + count);
        // convert the Set to List
        List<Period> periodList = new ArrayList<Period>(periodSet);
        return periodList;
    }

    // Object
    public static class Period {
        int start;
        int end;

        public Period(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Period{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Period)) return false;
            Period period = (Period) o;
            return start == period.start &&
                    end == period.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }
}
