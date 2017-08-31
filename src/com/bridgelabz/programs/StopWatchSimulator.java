/****************************************************************************** 
 *  Purpose: Stopwatch Program for measuring the time that elapses between
			the start and end & print elapsed time 
 *
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/
public class StopWatchSimulator {
	public static void main(String[] args) {
		System.out.print("Enter sec after to stop ");
		long stopsec = scanner.nextLong();
		Utility.stopWatchSimulator(stopsec);
	}
}