# Electricity-usage-and-bill-analyzer
# Project Overview
Many households and students do not understand how much electricity they consume, which appliances use the most power, and why their electricity bill becomes high. This project helps users enter appliance usage details, calculate total units consumed, estimate monthly electricity bills, and identify ways to reduce electricity consumption.

# Requirements
To run this project, the user requires the following:
Java JDK must be installed in the system (version 8 or above).
A terminal or command prompt or any Java IDE (VS Code, IntelliJ, Eclipse) must be available.
How to Set Up and Run
• Step 1: Download the Code
The user must download the code from the repository.
• Step 2: Open the Folder
The user must go to the folder where the file App.java is available.
• Step 3: Compile the Program
The user must open the terminal in the folder and type the following command:
javac App.java
• Step 4: Run the Program
After this, execute the following command in the command prompt to run the program: java App.

# Objective of the Project

The main objective of this project is to:
	•	Calculate electricity usage of different appliances
	•	Estimate total monthly energy consumption in kWh (units)
	•	Generate an approximate electricity bill
	•	Show which appliances consume the most electricity
	•	Suggest ways to reduce electricity cost

# Core Idea of How It Works

The user enters details like:
	•	Appliance name
	•	Power rating in watts
	•	Hours used per day
	•	Number of days used in a month

Then your program calculates:

Formula:

Units Consumed (kWh) = (Watt × Hours × Days) / 1000

Example:
	•	Fan = 75W
	•	Used 10 hours/day
	•	For 30 days

Units =
(75 × 10 × 30) / 1000 = 22.5 units

Then total units of all appliances are added.

After that, the program calculates the electricity bill based on slab rates.

# Author
Venya Rajput
