package utilities;

public class Output {
	public static void printResults(OutputInfo outputInfo){
		System.out.printf("Result reported by %s: \t%s", outputInfo.algorithmName, outputInfo.result);
		System.out.printf("\n %s time: \t%.3f ms", outputInfo.algorithmName, (outputInfo.endTime - outputInfo.startTime) / 1000.0 / 1000.0);
		System.out.println();
	}
}
