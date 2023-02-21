 ______ ______ ______ ______ ______ ______ ______ ______ ______
       __          ______        ___    ____
      / /___  ____/_  __/  _   _|__ \  / __ \
 __  / / __ \/ __ \/ /    | | / /_/ / / / / /
/ /_/ / /_/ / /_/ / /     | |/ / __/_/ /_/ /
\____/\____/\____/_/      |___/____(_)____/
 ______ ______ ______ ______ ______ ______ ______ ______ ______


NOTICE: Please take the time to read over the entire document,
most importantly sections 4.0, 5.0, and 9.0.

 ______ ______ ______ ______ ______ ______ ______ ______ ______

			Contents
 ______ ______ ______ ______ ______ ______ ______ ______ ______

Introduction	.	.	.	.	1.0
Hardware Requirements	.	.	.	2.0
Software Requirements	.	.	.	3.0
Installation	.	.	.	.	4.0
Running	JOOT	.	.	.	.	5.0
JIB	.	.	.	.	.	6.0
Web References	.	.	.	.	7.0
Copyright	.	.	.	.	8.0
License	.	.	.	.	.	9.0

 ______ ______ ______ ______ ______ ______ ______ ______ ______

1.0	Introduction

	The second incarnation of JOOT is designed to be more
of a tool for building communications systems than a system
to help people "chat" over the Internet (as were OOT and older
versions of JOOT).  Ultimately, the goal of JOOT v2.0 is to
help people communicate over the Internet (or Intranets).  How
this is accomplished (real-time voice, video, text-based
chat, or any combination) is left to the people using JOOT.

	To help demonstrate the ease at which systems can be
constructed using JOOT, a simple chat system (called a Talker)
has been included.  The chat system is written using a language
specifically designed to help JOOT achieve its main goal.  This
language is called JIB: JOOT's Interpreted BASIC.

 ______ ______ ______ ______ ______ ______ ______ ______ ______

2.0	Hardware Requirements

	Any system capable of running a Java Virtual Machine.
The following specifications are minimal; the better your
computer, the better JOOT will perform:

	CPU		486
	CPU Speed	100 MHz
	RAM		16 MB
	Harddisk	200 KB
	Internet	14.4 Kbps connection

	JOOT, being Java-based, will also run on the Macintosh,
and Sun Workstations.  (See the Java Ports section of Web
References.)

 ______ ______ ______ ______ ______ ______ ______ ______ ______

3.0	Software Requirements

	A 32-bit Operating System: OS/2 Warp, Linux, Windows
(95, 98, NT 4.0), MacOS 8.0, most Unix derivatives.

	A Java Virtual Machine conforming to the 1.2 (renamed to
2.0) standard.  (See the Java Ports section of Web References.)

 ______ ______ ______ ______ ______ ______ ______ ______ ______

4.0	Installation

	Since you are reading this, you are very close to
completing the installation of JOOT v2.0.  The last thing you
must do is download and install a Java Virtual Machine (JVM)
which conforms to the 1.2 (or 2.0) standard.  (See the JavaSoft
Homepage section of Web References.)  The Java Runtime
Environment (JRE) is the fastest and easiest JVM to get JOOT
up and running.

	You will need to set your CLASSPATH environment
variable to point to the fully directory path where this README
file is located.  For example, if you have installed this using
the self-extracting archive (joot2-0.exe), then the CLASSPATH
environment variable should probably look similar to:

	CLASSPATH=C:\Program Files\JOOT2-0;

	The easiest way to do this, in Windows is just before
you run JOOT (next section) type in:

	set CLASSPATH=C:\Program Files\JOOT2-0;

	You're now ready to run JOOT v2.0!

 ______ ______ ______ ______ ______ ______ ______ ______ ______

5.0	Running JOOT

	ON WINDOWS
	----------
	Once you have installed a Java Virtual Machine, open up
a new MS-DOS prompt (Start >> Programs >> MS-DOS), and change
to the com\joot subdirectory where you installed JOOT, using the
following commands:

	c:
	cd \Program Files\JOOT2-0\com\joot

	The first command ensures you are changing to a valid
directory on the C: drive.  The second command moves you into
appropriate directory.

	Ensure your CLASSPATH environment variable is set
(see previous section), and issue the following command:

	java com.joot.Joot

	You should now have JOOT running on port 5000!

	ON UNIX
	-------
	Once you have installed a Java Virtual Machine, change
to the directory where you installed JOOT, and issue the
following commands:

	cd com/joot
	java com.joot.Joot &

	You should now have JOOT running on port 5000!

	ON MACINTOSH
	------------
	Anybody have any ideas what is involved here?

	Command-line Arguments
	----------------------
	To see a list of different ways to run JOOT, run JOOT
with the following command:

	java com.joot.Joot -h

 ______ ______ ______ ______ ______ ______ ______ ______ ______

6.0	JIB

	First, a brief introduction to JIB.

	JIB, in full, stands for Java-based Object-Oriented
Technology's Interpreted Beginners All-purpose Symbolic
Instruction Code.  In essence, it is a stripped-down version
of the BASIC programming language which is the core component
to JOOT v2.0. JIB allows people to create communications
software that deals with the interactions of people over the
Internet (or Intranets).

	The language knows about people connected to the
system (called users) as well as virtual rooms (groups of
users).  Moreover, JIB hides the gory details of sockets,
threads, and ports.  It also allows the administrators of a
JOOT system to make major changes to the code without having
to recompile source code -- and sometimes without having to
kick people off the system!

	Next, an overview of how to program in JIB.  For now,
take a look in the com\joot\commands directory.  In there you
will find many ".jib" files that serve as examples on how to
code in JIB.

 ______ ______ ______ ______ ______ ______ ______ ______ ______

7.0	Web References

	* JOOT's Official Homepage
		https://dave.autonoma.ca/

	* JavaSoft's Homepage, with Java Virtual Machines for
	Windows and Solaris
		http://java.sun.com/

	* Java Ports
		http://java.sun.com/cgi-bin/java-ports.cgi

 ______ ______ ______ ______ ______ ______ ______ ______ ______

8.0	Copyright

JOOT v2.0 is copyright (C) 1997-1999 by Dave Jarvis.  You may
not, without prior written and signed consent from Dave Jarvis,
distribute any portion of JOOT or its documentation.

 ______ ______ ______ ______ ______ ______ ______ ______ ______

9.0	License

*** ADDED BY TALKERSOURCE.COM (2023) ***

Copyright holder Dave Jarvis granted permission via e-mail for
the TalkerSource.com archive to host and distribute, via GitHub,
copies of JOOT re-licensed under the terms of the MIT free open-
source software license, which can be found in the LICENSE file
alongside this README.txt.  The license text below contains the
unmodified, original terms, preserved for historical reference.

*** END OF TALKERSOURCE.COM ADDENDUM ***

This license ("License") contains rights and restrictions
associated with use of the accompanying software. Read the
License carefully before using the Software.  By using the
Software you are agreeing to the terms and conditions of this
License. 

1.Limited License Grant. By installing this software, Dave
Jarvis ("I", "me", or "my") grants to you ("Licensee") a
nonexclusive, nontransferable, worldwide, royalty-free license
to use this release of JOOT version 2.0 (the "Software") for
EVALUATION PURPOSES ONLY.  You may use the Software for up to
thirty (30) days after downloading.  After the thirty days
have expired you must either contact Dave Jarvis to get a
Registered License, or destroy ALL COPIES of the Software and
its documentation.

Licensee agrees that it shall use the Software provided
hereunder solely for Licensee's internal purposes and not for
computer operations of any critical nature. This Software is
subject to change which may cause data (including but not
limited to User files and Room files) generated using, or for,
the Software to be incompatible with subsequent versions. 

2.Restrictions. The Software is copyrighted and title to all
copies is retained by me and/or its licensors. Licensee shall
not make copies of Software, other than a single copy of
Software in machine-readable format for back-up or archival
purposes and, if applicable, Licensee may print one copy of
on-line documentation, in which event all proprietary rights
notices on Software and on-line documentation shall be
reproduced and applied to all copies. LICENSEE SHALL NOT
MODIFY, DECOMPILE, DISASSEMBLE, DECRYPT, EXTRACT, OR OTHERWISE
REVERSE ENGINEER Software. Software may not be transferred,
leased, assigned, or sublicensed, in whole or in part. 

3.Confidentiality. Software is confidential and proprietary
information of me and/or its licensors. Licensee agrees to
take adequate steps to protect Software from unauthorized
disclosure or use. 

4.Disclaimer of Warranty. Software is provided "AS IS,"
without a warranty of any kind. ALL EXPRESS OR IMPLIED
REPRESENTATIONS AND WARRANTIES, INCLUDING ANY IMPLIED WARRANTY
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR NON-
INFRINGEMENT, ARE HEREBY EXCLUDED. 

5.Limitation of Liability. MY LICENSORS AND I SHALL NOT BE
LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE OR ANY THIRD PARTY
AS A RESULT OF USING OR DISTRIBUTING SOFTWARE. IN NO EVENT
WILL MY LICENSORS OR I BE LIABLE FOR ANY LOST REVENUE, PROFIT
OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL,
INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS
OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF OR
INABILITY TO USE SOFTWARE, EVEN IF I HAVE BEEN ADVISED OF THE
POSSIBILITY OF SUCH DAMAGES. 

6.Termination. Licensee may terminate this License at any
time by destroying all copies of Software. This License will
terminate immediately without notice from me if Licensee fails
to comply with any provision of this License. Upon such
termination, Licensee must destroy all copies of Software.

 ______ ______ ______ ______ ______ ______ ______ ______ ______

<FIN>
