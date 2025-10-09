class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        long sumSkill = 0;
        for (int s : skill) sumSkill += s;
        long prevWizardDone = sumSkill * (long)mana[0];
        for (int j = 1; j < m; j++) {
            long prevPotionDone = prevWizardDone;
            for (int i = n - 2; i >= 0; i--) {
                prevPotionDone -= (long)skill[i + 1] * mana[j - 1];
                prevWizardDone = Math.max(prevPotionDone, prevWizardDone - (long)skill[i] * mana[j]);
            }
            prevWizardDone += sumSkill * (long)mana[j];
        }

        return prevWizardDone;
    }
}