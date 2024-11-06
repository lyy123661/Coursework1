int[] average_grades(int[][] grades, int[] weights) {
    int numStudents = grades.length;
    int numAssessments = grades[0].length;
    int[] result = new int[numStudents];
    
    for (int i = 0; i < numStudents; i++) {
        int weightedSum = 0;
        for (int j = 0; j < numAssessments; j++) {
            weightedSum += grades[i][j] * weights[j];
        }
        result[i] = weightedSum / 100;
    }
    
    return result;
}