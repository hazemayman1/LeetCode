class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char testedCharacter = s.charAt(i);
            char followingCharacter = '_';
            if (i < s.length() - 1) {
                followingCharacter = s.charAt(i + 1);
            }

            switch (testedCharacter) {
                case 'I':
                    if (followingCharacter == 'V' || followingCharacter == 'X') {
                        result -= 1;
                        break;
                    }
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (followingCharacter == 'L' || followingCharacter == 'C') {
                        result -= 10;
                        break;
                    }
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (followingCharacter == 'D' || followingCharacter == 'M') {
                        result -= 100;
                        break;
                    }
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;

            }

        }

        return result;
        
    }
}