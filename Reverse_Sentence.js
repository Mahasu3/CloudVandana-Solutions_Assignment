/**
 * 
 */
 
 
 
 
function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = sentence.split(' ');

    // Iterate through the words and reverse each one
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);
