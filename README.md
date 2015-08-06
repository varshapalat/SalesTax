Instructions to push your code to code.google.com
=================================================
1. Sign into GitHub and create a new repository
        Repository name: twu-biblioteca-yourname
        Privacy level: Public
        Don't check "Initialize this repository with a README"
        Add .gitignore: None
        Add a license: Apache License 2.0

2. Run 'git init' in the folder that was extracted from the downloaded .zip file, in order to
 initialize local repository.

3. Make a local commit.
    $ git add -A
    $ git commit -m “Initial commit”

(Dont forget to add the hidden .idea folder, as it will make opening your project in Intellij easier.)

4. After you are done with the local commit, you can share your code with "The World" by pushing it to your
 GitHub repository.
    $ git remote add origin https://github.com/<YOUR-GITHUB-USERNAME>/twu-biblioteca-<YOURNAME>
    $ git push origin master

Instructions to open your code in Intellij
==========================================
1. Go to File -> Open (or Open Project)
2. Select the directory containing the code
DONE !


SALES TAX 
===============

Basic sales tax is applicable at a rate of 10% on all goods, except books, food,
and medical products that are exempt. Import duty is an additional sales tax
applicable on all imported goods at a rate of 5%, with no exemptions.

When I purchase items I receive a receipt which lists the name of all the items
and their price (including tax), finishing with the total cost of the items,
and the total amounts of sales taxes paid.  The rounding rules for sales tax are
that for a tax rate of n%, a shelf price of p contains (np/100 rounded up to
the nearest 0.05) amount of sales tax.

Requirements
=============

The requirements of this application are:

[1] IntelliJ IDEA

[2] Ant

[3] JUnit 4.11

[4] Hamcrest Core 1.3

[5] mockito-all-1.9.5


How to Run?
============

To run the application in your system, just open the application in IntelliJ IDEA,
then goto Run -> Run or you can press options+shift+F10

How to Build
=============

This application using the Ant Build System. You can change your build settings by changing
the **build.xml** present in the project directory. To build the application, just type following
command in your shell:

    $ ant

