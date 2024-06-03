
package main

import "fmt"

func appendCharacters(source string, target string) int {
	var indexSource = 0
	var indexTarget = 0

	for indexSource < len(source) && indexTarget < len(target) {
		if source[indexSource] == target[indexTarget] {
			indexTarget++
		}
		indexSource++
	}

	return len(target) - indexTarget
}
