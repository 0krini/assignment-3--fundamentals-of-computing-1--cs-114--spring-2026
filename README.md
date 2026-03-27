# Spring 2026 Fundamentals of Computing I — Assignment 3

* **Read these instructions repeatedly until you understand the requirements for this assignment, then begin your project. If something is not clear, ask.**

## ❖ Before You Begin ❖

1. Log in to GitHub.
2. Fork this repository. See [this video](http://code-warrior.github.io/tutorials/git/github/forking-and-cloning-at-the-github-web-site/) on how to carry out this and the following step.
3. Clone your fork, using the website or the GitHub Desktop client.
4. Checkout your personalized branch, the one with your name.

Additionally, ensure VS Code’s settings include — at the very least — the following:

```json
  "files.eol": "\n",
  "files.insertFinalNewline": true,
  "files.trimFinalNewlines": true,
```

To update your settings, do the following:

1. Launch VS Code’s settings.
2. If your settings are set to the graphical interface, search for “workbench settings editor”, then choose `json` under the dropdown menu for **Workbench** > Settings: **Editor**.
3. Close and relaunch your settings.
4. Copy the entries above into your settings.

For a more elaborate list of settings, visit [https://github.com/code-warrior/web-dev-env-config-files/blob/master/visual-studio-code/settings.json](https://github.com/code-warrior/web-dev-env-config-files/blob/master/visual-studio-code/settings.json).

---

## ❖ Instructions ❖

In this assignment, you’ll be writing two programs. For the first one, you’ll be writing a program that accepts input from the user in the form of an integer, then creates a diamond whose width (in columns) and height (in rows) are dictated by user input. For example, if the user enters 5, then the height of the diamond is 5 rows and the width of the diamond is 5 columns. **A movie of how this program should behave in its resolved state is available at [https://roy.vanegas.org/video/diamond-program-in-java.mp4](https://roy.vanegas.org/video/diamond-program-in-java.mp4).**

**Note**: Odd and even versions of the diamond are rendered differently. Review the aforementioned video carefully for an example.

Here are two examples of the output, one for an even situation, the other for an odd.

```bash
Enter a number
8
        *
       * *
     * * * *
   * * * * * *
 * * * * * * * *
   * * * * * *
     * * * *
       * *
        *

Enter a number
5
  *
 ***
*****
 ***
  *
```

For the second program, you’ll be rendering a matrix whose size is dictated by user input, based on the following rules:

1. Requests from the user a positive number representing the size of a matrix.
2. Prints a matrix consisting of `0`s.
3. Populates the matrix with values from `1–(input × input)`.
4. Prints the matrix with the newly-populated values.
5. Swaps the contents of the matrix on one side of the diagonal formed from top right to bottom left with the other side, highlighting the elements along the diagonal and leaving them un-touched/un-swapped.
6. Prints the flipped matrix.

As mentioned in item 5, the elements in the diagonal **must not be touched**, while the other elements in the matrix **must be swapped**. The numbers in every cell of the matrix is arbitrary; each cell could have contained a letter, string, image, or other object/primitive. Numbers are being used in this assignment because they produce a sequence that is easy to follow when working with the matrix. **A movie of how this program should behave in its resolved state is available at [https://roy.vanegas.org/video/matrix-flip-along-diagonal--java.mp4](https://roy.vanegas.org/video/matrix-flip-along-diagonal--java.mp4).**

---

## ❖ Rules for Matrix Program ❖

1. Your `Matrix` class should contain a single field called `matrix` of the primitive type required to create a matrix.
2. The `Matrix` constructor should accept an integer value as an argument named `size`, then create a `matrix` field whose width and height are equivalent to the integer passed to it. The constructor should also report to the user the dimensions of the matrix.
3. As part of the `Matrix` class, write a `private` method called `swap` that will accept four arguments: `x1`, `y1`, `x2`, and `y2`, each representing the indices of the two elements in the matrix that should be swapped.
4. Write a `public` method called `printMatrix` that accepts no arguments and returns nothing. It should print the matrix, highlighting in yellow the diagonal from top right to bottom left.
5. Write a `public` method called `populateMatrix` that accepts no arguments and returns nothing. It should simply populate the matrix with values from `1–(size × size)`.
6. Write a `public` method called `flipMatrix` that accepts no arguments and returns nothing. It should “flip” the matrix’s values along the diagonal from top right to bottom left. The elements that comprise the diagonal should be highlighted and not swapped.

---

## ❖ File List ❖

This repo contains the following files, all required to carry out this assignment. Before you start working, ensure you understand the role of each file below.

1. `Makefile` — There is a `Makefile` in the `diamond` and `matrix` folders. You needn’t use them to build/run your programs, but I use them to grade your assignments. If they don’t work for me, then you’ll earn a 0 for each non-working program. Thus, you’re advised to use them as you develop the programs in this assignment. Recall that running `make` in your command line interface, or CLI, builds your program. If you want to test input into a program after building it, you can run `make run`. Run `make clean` to remove all class files. **Do not edit.**
2. `.editorconfig` — There are `.editorconfig` files in the `diamond` and `matrix` folders. Each is a redundancy of what’s already in the `.editorconfig` file you installed in your home folder at the beginning of the semester. They’re here to make sure you’re working with the formatting rules defined in `.editorconfig`. *Ensure EditorConfig is working in VS Code before beginning this assignment.* **Do not modify any of them.**
3. `Diamond.java` — Add your diamond-related code here. **Do not** write your code in anything *other* than this file.
4. `Matrix.java` — Where the entire `Matrix` class and its methods will be defined.
5. `RunMatrix.java` — Method `main` goes in this file, along with the instantiation of the `Matrix` object.
6. `.gitignore` — There are various `.gitignore` files throughout this repository. **Do not modify any of them.**

---

## ❖ Grading ❖

| Item                                                                                  | Points |
|---------------------------------------------------------------------------------------|:------:|
| Diamond program works according to instructions                                       |  `20`  |
| Matrix program works according to instructions                                        |  `20`  |
| Variables, and methods, if applicable, use intelligent and logical names              |  `20`  |
| Code is neat, professional, and formatted according to conventions discussed in class |  `20`  |
| Assignment rules followed                                                             |  `20`  |

---

## ❖ Due ❖

Wednesday, 15 April 2026, at 5:00 PM.

---

## ❖ Submission ❖

Issue a pull request back into the original repo, the one from which your fork was created for this project. See the **Issuing Pull Requests** section of [this site](http://code-warrior.github.io/tutorials/git/github/index.html) for help on how to submit your assignment.

**Note**: This assignment may _only_ be submitted via GitHub. **No other form of submission will be accepted**.
