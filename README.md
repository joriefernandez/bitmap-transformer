# Bitmap Transformer 1
Authors: Jorie Fernandez, Yuan Gao.
Used to transform the user input image.

## About the Program
To run using terminal: ./gradlew run --args 'inputFilePath outputFilePath transform'

### Options for tranform arguments:
1. grayscale - transform into grayscale image
2. blur - transform into blurred image
3. invert - transform into inverted color image
4. xray - transform half image to xray-like

### Example usage:
./gradlew run --args '/Users/name/input.bmp /Users/name/output.bmp grayscale'

## Source Code
* Created [App and Bitmap classes](https://github.com/joriefernandez/bitmap-transformer/tree/master/cli/src/main/java/cli) under src folder.
* Test cases for [BitMapTest](https://github.com/joriefernandez/bitmap-transformer/blob/master/cli/src/test/java/cli/BitMapTest.java)




