# Secrets.java documentation
My Secrets.java file contains my api key for the Tomorrow.io weather api which is used in the getWeather class. 
The secret's class also contains the file permissions that were set for the log file which were set to read and writable for the owner of the file only. 
The filePerm method in Secrets is used in the main method and sets the files permissions before being used. 
# SAST & results
The tool I chose as a SAST to run on my program is called Qwiet the results I will post as photos in the files of this branch, this tool basically stated that there were 7 critical vulnerabilities,
46 high, 12 medium and 3 low. This may look bad but in reality it said that all of the exploitable vulnerabities were not reachable so they were not really a concern. 
Basically all of the vulnerabilities were not reachable wether they were exploitable or not, a lot of these vulnerabilities mentioned dealt with packages that were in my program. 
The tool made comments about stuff that can be exploitable in packages wether I even implemented that thing in my program or not, so maybe the analyzer isnt super realistic of my program itself 
though these comments may be helpful if someone wants to be conscious of possible exploits that could happen within their program given someone with unprivledged access for instance. 
# SBOM
The API used was Tomorrow.io for weather forecast data.
External libraries used was json-20231013.jar as well as all of the jar's used in the JUnit5 Library. (For more detail see photo in the file of this branch)
Aside from these libraries of course the JRE System Library was used with all of its jar's as well. (again for more detail see photo in the file of this branch)
