//non-compiled with javac: contains different class name by demand of test
package com.puppycrawl.tools.checkstyle.checks.outertypefilename;
/* Config:
 * default
 */
public record IncorrectName(int x, int y, String str) { // violation

}
