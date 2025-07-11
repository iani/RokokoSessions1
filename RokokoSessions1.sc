//  木 10  7 2025 15:
// handle paths for folders holding rokoko sessions
// Put this folder or a symbolic link to  this folder into
// your Extensions directory, and recompile the class library.

RokokoSessions1 : RokokoSessionsBookmark {
	*animationFolders {
		^this subsubfolders: "Animations"
	}
}