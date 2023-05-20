# Yakuza-4-Modding-Materials
This is a program I have been working on in my spare time for fun. 
In the video game Yakuza 4, you can create weapons, armor, and gear.  
Each item you craft requires a blueprint, parts, a base, and money.
The game does a poor job of showing how to craft each item and keeping track of which items are left. 
The goal of this program is to create and display every item that still needs to be crafted, what parts/blueprints are necessary, and how much money is needed.

So far I have:
1. Imported a list of all items/weapons/blueprints into a CSV from a walkthrough online
2. Cleaned up all the data so all tables match
3. Created classes for data
4. Created a GUI to display the information
5. Populated the data into tables on the GUI
6. Program checks for a list of parts that are still needed
7. If no such list exists, it is created
8. Data in the table switches between parts still needed and all parts

Still to do:
1. Delete items from completed parts CSV 
2. Switch data in table by type
3. Calculate how much money is required total
