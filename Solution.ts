
function appendCharacters(source: string, target: string): number {
    let indexSource = 0;
    let indexTarget = 0;

    while (indexSource < source.length && indexTarget < target.length) {
        if (source.charAt(indexSource) === target.charAt(indexTarget)) {
            ++indexTarget;
        }
        ++indexSource;
    }

    return target.length - indexTarget;
};
