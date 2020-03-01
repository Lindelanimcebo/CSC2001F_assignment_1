JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin
LOGSDIR=logs
DATADIR=data

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES=Entry.class FileHelper.class LSArray.class LSArrayApp.class \
BinaryTreeNode.class BTQueueNode.class BTQueue.class  BinaryTree.class \
BinarySearchTree.class LSBST.class LSBSTApp.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class
	rm $(SRCDIR)/*~
	rm $(LOGSDIR)/*

clean-t:
	rm $(DATADIR)/*test*


runA:
	java -cp bin LSArrayApp $(stage) $(day) $(time)

runB:
	java -cp bin LSBSTApp $(stage) $(day) $(time)

generate:
	python scripts/generateFiles.py