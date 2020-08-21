package arrayList;
import java.util.ArrayList;

public class MergeIntervals {

	
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval)
	{
		//ArrayList<Interval> outInterval = new ArrayList ();
		if(intervals == null || intervals.size() == 0) {
			intervals = new ArrayList<Interval>();
			intervals.add(newInterval);
		}
		
		int i = 0;
		Interval toInsert = newInterval;
		while(i < intervals.size())
		{
			Interval current= intervals.get(i);
			if(current.end < toInsert.start) {
				i++;
				continue;
			}
				
			else if(toInsert.end < current.start) {
				intervals.add(toInsert);
				break;
			}
				
			else {
				toInsert.start = Math.min(current.start, toInsert.start);
				toInsert.end = Math.max(current.end, toInsert.end);
				intervals.remove(i);
			}
			if(i <= intervals.size())
				intervals.add(toInsert);
		}
		
			
		return intervals;
	}
}
