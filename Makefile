JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin
LOGSDIR=logs

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=Entry.class FileHelper.class LSArray.class LSArrayApp.class
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class
	rm $(SRCDIR)/*~
	rm $(LOGSDIR)/*

run:
	java -cp bin LSArrayApp $(stage) $(day) $(time)